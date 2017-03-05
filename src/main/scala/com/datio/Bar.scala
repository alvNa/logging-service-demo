package com.datio
import org.apache.logging.log4j.Logger
import org.apache.logging.log4j.LogManager

class Bar {
  private val logger = LogManager.getLogger(this.getClass().getName());

  def doIt():Boolean ={
    logger.entry()
    logger.error("Did it again!")
    logger.exit(false)
  }
}