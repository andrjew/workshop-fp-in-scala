package workshop.p4.option

import java.util.Locale

case class TranslationKey(locale: Locale, msgCode: String)

trait TranslationRepo {
  def findByKey(key: TranslationKey): Option[String]
}

/**
  * DON'T MODIFY THIS
  */
object TranslationRepoMapImpl extends TranslationRepo {

  private val db = Map(
    TranslationKey(Locale.ENGLISH, "_hello_") -> "Hello",
    TranslationKey(Locale.ITALIAN, "_hello_") -> "Ciao"
  )

  override def findByKey(key: TranslationKey): Option[String] = {
    db.get(key)
  }
}