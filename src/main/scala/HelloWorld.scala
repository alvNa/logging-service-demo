import java.time.LocalDate

import com.datio.Bar
import org.apache.logging.log4j.LogManager;

object HelloWorld extends App {
  private val logger = LogManager.getLogger(getClass())

  logger.info("Hello, World!")
  logger.debug(s"Integer.MAX_VALUE = ${Int.MaxValue}")
  logger.debug(s"Long.MAX_VALUE = ${Long.MaxValue}")

  logger.trace("Entering application.")
  val bar = new Bar()
  if (!bar.doIt()) {
    logger.error("Didn't do it.")
  }
  logger.trace("Exiting application.")
}