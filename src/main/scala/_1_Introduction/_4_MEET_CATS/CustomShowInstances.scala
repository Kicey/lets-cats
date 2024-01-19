package _1_Introduction._4_MEET_CATS

import cats.Show

import java.util.Date

implicit val dateShow: Show[Date] =
  (date: Date) => s"${date.getTime}ms since the epoch."
