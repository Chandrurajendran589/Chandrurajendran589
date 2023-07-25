package com.wsgc.subsets

import com.typesafe.config.{Config, ConfigFactory}

/**
 * Defines the PAW headers for subsets endpoint requests.
 *
 * @author nkunta
 */
object SubsetsHeader {

  val conf: Config = ConfigFactory.load()

  val env: String = conf.getString("subsets.environment")
  val market: String = conf.getString("subsets.marketCode")
  val brand: String = conf.getString("subsets.conceptCode")
  val cat: String = conf.getString("subsets.cat")

  val baseContextHeader: String = "environment="+env+";application=ecommerce;market="+market+";concept="+brand
  val catHeader: String = "CAT="+cat

  def subsetsHeaders: _root_.scala.Predef.Map[_root_.scala.Predef.String, _root_.scala.Predef.String] = {
    Map(
      "PAW-Base-Context" -> baseContextHeader,
      "PAW-Mount-Path" -> "/api/catalog/v1/",
      "PAW-Context" -> "generations=CAT",
      "PAW-Active-Generations" -> catHeader,
      "PAW-Request-Time" -> "2020-08-10T21:04:37.749194Z",
      "WSI-Trace-Id" -> "0.d54fde17.1605044596.343c59af/componen"
    )
  }
}
