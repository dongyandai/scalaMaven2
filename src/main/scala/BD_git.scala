package com.statistics

import com.statistics.bean.{GenresRecommendation, MongoConfig, Movie, Rating, Recommendation}

import java.text.SimpleDateFormat
import java.util.Date
import org.apache.spark.SparkConf
import org.apache.spark.sql.{DataFrame, SparkSession}


object StatisticsRecommender {

// 定义表名
