/*
 * Copyright (C) 2016 Lightbend Inc. <http://www.lightbend.com>
 */
package akka.stream.alpakka.mqtt.scaladsl

import akka.Done
import akka.stream.alpakka.mqtt.{ MqttMessage, MqttSourceStage, MqttSourceSettings }
import akka.stream.scaladsl.Source

import scala.concurrent.Future

object MqttSource {
  /**
   * Scala API: create an [[MqttSource]] with a provided bufferSize.
   */
  def apply(settings: MqttSourceSettings, bufferSize: Int): Source[MqttMessage, Future[Done]] =
    Source.fromGraph(new MqttSourceStage(settings, bufferSize))

}
