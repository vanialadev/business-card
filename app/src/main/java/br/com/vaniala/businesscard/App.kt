package br.com.vaniala.businesscard

import android.app.Application
import br.com.vaniala.businesscard.data.AppDatabase
import br.com.vaniala.businesscard.data.BusinessCardRepository

/**
 * Created by Vânia Almeida (Github: @vanialadev)
 * on 11/12/21.
 *
 */
class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}