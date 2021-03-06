package org.fluentd.logger.scala.sender

import scala.collection.Map;

trait Sender {
  def emit(tag: String, data: Map[String, Any]): Boolean;

  def emit(tag: String, timestamp: Long, data: Map[String, Any]): Boolean;

  def flush();

  def getBuffer(): Array[Byte];

  def close();

  def getName(): String;
}