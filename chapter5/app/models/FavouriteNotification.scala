package models

case class FavouriteNotification(recipient: Friend, favourite: FavouriteStudio) {
  def send(): Unit = {
    // TODO: Send a notification to Amazon SNS
  }
}
