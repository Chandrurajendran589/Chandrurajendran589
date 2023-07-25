package com.wsgc.utils

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

import org.apache.http.client.methods.HttpDelete
import org.apache.http.client.methods.HttpGet
import org.apache.http.client.methods.HttpPost
import org.apache.http.entity.StringEntity
import org.apache.http.impl.client.HttpClientBuilder

/**
  * A REST client that makes GET, POST and DELETE requests to a REST server.
  */
object RestClient {

  /**
    * Sends a GET request to a REST server.  The response is
    * returned as a string.  If there is a problem, a blank String
    * is returned.
    *
    * @param url The URL to use in the REST call.
    * @param urlHeaders The headers to use with the URL.
    *
    * @return The response as a string.  If there is a problem, a blank string
    *         is returned.
    *
    * @throws java.io.IOException if an I/O error occurs.
    * @throws java.net.SocketTimeoutException if a network error occurs.
    * @throws org.apache.http.client.ClientProtocolException if a bad request is made.
    * @throws java.lang.UnsupportedOperationException if a bad request is made.
    */
  @throws(classOf[java.io.IOException])
  @throws(classOf[java.net.SocketTimeoutException])
  @throws(classOf[org.apache.http.client.ClientProtocolException])
  @throws(classOf[java.lang.UnsupportedOperationException])
  def get(url:String, urlHeaders:Map[String, String]): String = {
    val httpClient = HttpClientBuilder.create().build()
    val request = new HttpGet(url)
    urlHeaders.foreach {
      case(key, value) => request.setHeader(key, value)
    }
    val httpResponse = httpClient.execute(request)
    val entity = httpResponse.getEntity
    var content = ""
    if (entity != null) {
      val inputStream = entity.getContent
      content = inputStreamToString(inputStream)
      if (inputStream != null) inputStream.close
    }
    if (httpClient != null) httpClient.close
    content
  }

  /**
    * Sends a DELETE request to a REST server.  The response is
    * returned as a string.  If there is a problem, a blank String
    * is returned.
    *
    * @param url The URL to use in the REST call.
    * @param urlHeaders The headers to use with the URL.
    *
    * @return The response as a string.  If there is a problem, a blank string
    *         is returned.
    *
    * @throws java.io.IOException if an I/O error occurs.
    * @throws java.net.SocketTimeoutException if a network error occurs.
    * @throws org.apache.http.client.ClientProtocolException if a bad request is made.
    * @throws java.lang.UnsupportedOperationException if a bad request is made.
    */
  @throws(classOf[java.io.IOException])
  @throws(classOf[java.net.SocketTimeoutException])
  @throws(classOf[org.apache.http.client.ClientProtocolException])
  @throws(classOf[java.lang.UnsupportedOperationException])
  def delete(url:String, urlHeaders:Map[String, String]): String = {
    val httpClient = HttpClientBuilder.create().build()
    val request = new HttpDelete(url)
    urlHeaders.foreach {
      case(key, value) => request.setHeader(key, value)
    }
    val httpResponse = httpClient.execute(request)
    val entity = httpResponse.getEntity
    var content = ""
    if (entity != null) {
      val inputStream = entity.getContent
      content = inputStreamToString(inputStream)
      if (inputStream != null) inputStream.close
    }
    if (httpClient != null) httpClient.close
    content
  }

  /**
    * Sends a POST request to a REST server.  The response is
    * returned as a string.  If there is a problem, a blank String
    * is returned.
    *
    * @param url The URL to use in the REST call.
    * @param urlHeaders The headers to use with the URL.
    * @param requestBody The body (as a string) to use with the URL.
    *
    * @return The response as a string.  If there is a problem, a blank string
    *         is returned.
    *
    * @throws java.io.IOException if an I/O error occurs.
    * @throws java.net.SocketTimeoutException if a network error occurs.
    * @throws org.apache.http.client.ClientProtocolException if a bad request is made.
    * @throws java.lang.UnsupportedOperationException if a bad request is made.
    */
  @throws(classOf[java.io.IOException])
  @throws(classOf[java.net.SocketTimeoutException])
  @throws(classOf[org.apache.http.client.ClientProtocolException])
  @throws(classOf[java.lang.UnsupportedOperationException])
  def post(url:String, urlHeaders:Map[String, String], requestBody:String) : String = {
    val httpClient = HttpClientBuilder.create().build()
    val request = new HttpPost(url)
    urlHeaders.foreach {
      case(key, value) => request.setHeader(key, value)
    }
    request.setEntity(new StringEntity(requestBody))
    val httpResponse = httpClient.execute(request)
    val entity = httpResponse.getEntity
    var content = ""
    if (entity != null) {
      val inputStream = entity.getContent
      content = inputStreamToString(inputStream)
      if (inputStream != null) inputStream.close
    }
    if (httpClient != null) httpClient.close
    content
  }

  /**
   * Sends a POST request to a REST server with request parameters.
   * The response is returned as a string.  If there is a problem,
   * a blank String is returned.
   *
   * @param url The URL to use in the REST call.
   * @param urlHeaders The headers to use with the URL.
   * @param params The request parameters (as a Map) to use with the URL.
   *
   * @return The response as a string.  If there is a problem, a blank string
   *         is returned.
   *
   * @throws java.io.IOException if an I/O error occurs.
   * @throws java.net.SocketTimeoutException if a network error occurs.
   * @throws org.apache.http.client.ClientProtocolException if a bad request is made.
   * @throws java.lang.UnsupportedOperationException if a bad request is made.
   */
  @throws(classOf[java.io.IOException])
  @throws(classOf[java.net.SocketTimeoutException])
  @throws(classOf[org.apache.http.client.ClientProtocolException])
  @throws(classOf[java.lang.UnsupportedOperationException])
  def post(url: String, urlHeaders: Map[String, String], params: Map[String, String]): String = {
    val httpClient = HttpClientBuilder.create().build()
    val request = new HttpPost(url)
    urlHeaders.foreach {
      case (key, value) => request.setHeader(key, value)
    }
    request.setEntity(new StringEntity(params.map { case (k, v) => s"$k=$v" }.mkString("&")))
    val httpResponse = httpClient.execute(request)
    val entity = httpResponse.getEntity
    var content = ""
    if (entity != null) {
      val inputStream = entity.getContent
      content = inputStreamToString(inputStream)
      if (inputStream != null) inputStream.close
    }
    if (httpClient != null) httpClient.close
    content
  }

  private def inputStreamToString(is: InputStream) = {
    val inputStreamReader = new InputStreamReader(is)
    val bufferedReader = new BufferedReader(inputStreamReader)
    Iterator continually bufferedReader.readLine takeWhile (_ != null) mkString
  }

}
