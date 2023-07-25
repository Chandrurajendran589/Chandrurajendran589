package com.wsgc.singleusepromotion

import java.util

import com.google.gson.Gson
import com.wsgc.scenario.SingleUsePromotionRest
import com.wsgc.utils.RestClient
import org.apache.http.HttpHeaders

import scala.collection.immutable.HashMap


object SingleUsePromotionUtility {
  val gson = new Gson()

  def allocateBatch(effectiveCode: String, batchSize: Number, batchExpirationTime: Number): String = {
    println("Allocating a batch of single use promotions")
    val url =  SingleUsePromotionRest.serviceTestDataUrl
    val urlHeaders = HashMap(
      HttpHeaders.CONTENT_TYPE -> "application/json; charset=UTF-8",
      HttpHeaders.ACCEPT -> "application/json; charset=UTF-8"
    )

    var body = s"""{
                    "effectiveCode": "${effectiveCode}",
                    "batchSize": ${batchSize},
                    "expirationTimeMs": ${batchExpirationTime}
                    }"""
    var batchID = ""
    var response = ""

    response = RestClient.post(url, urlHeaders, body)
    if (response != null) {
      val jsonResponse = gson.fromJson(response, classOf[BatchStatus])
      SingleUsePromotionRest.logger.debug(s"Allocated BatchId: ${jsonResponse.batchId}")
      batchID = jsonResponse.batchId
    } else {
      SingleUsePromotionRest.logger.debug("ERROR: Cannot allocate batch")
    }
    batchID
  }

  def getListOfSingleUsePromotions(batchId: String): util.ArrayList[String] = {

    val url = SingleUsePromotionRest.serviceTestDataUrl + batchId
    var listOfPromos = new util.ArrayList[String]()
    val urlHeaders = Map.empty[String, String]

    val response = RestClient.get(url, urlHeaders)
    if (response != null) {
      listOfPromos = gson.fromJson(response, classOf[util.ArrayList[String]])
    } else {
      SingleUsePromotionRest.logger.debug(s"ERROR: Retrieving list of promotions for batchId $batchId")
    }
    listOfPromos
  }


  class BatchStatus {
    var concept = ""
    var status = ""
    var batchId = ""
  }

}




