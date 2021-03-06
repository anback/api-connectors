/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */

package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Trade (
  timestamp: DateTime,
  symbol: String,
  side: Option[String],
  size: Option[Double],
  price: Option[Double],
  tickDirection: Option[String],
  trdMatchID: Option[String],
  grossValue: Option[Double],
  homeNotional: Option[Double],
  foreignNotional: Option[Double]
) extends ApiModel


