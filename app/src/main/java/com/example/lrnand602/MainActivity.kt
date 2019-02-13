package com.example.lrnand602

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lrnand602.app.IPresenter
import com.example.lrnand602.app.Presenter
import com.example.lrnand602.dagger.AppComponent
import java.util.logging.Logger
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: IPresenter

    init {
        getAppComponent().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Logger.getGlobal().info(presenter.getData())
    }

    private fun getAppComponent(): AppComponent {
        return App.instance.appComponent
    }
}
