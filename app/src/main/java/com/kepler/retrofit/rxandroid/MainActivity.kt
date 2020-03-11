package com.kepler.retrofit.rxandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.NonNull
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.disposables.Disposable
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var Txt:TextView
    private lateinit var mObservable: Observable<String>
    private lateinit var mObserver: Observer<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Txt = findViewById(R.id.texView)
        mObservable = Observable.just("Hello From RxAndroid")


        mObserver = object: Observer<String> {

            override fun onSubscribe(@NonNull d: Disposable) {

            }
            override fun onNext(@NonNull s:String) {

                Txt.text = s

            }
            override fun onError(@NonNull e:Throwable) {

            }
            override fun onComplete() {

            }
        }
    }


    @Suppress("UNUSED_PARAMETER")
    fun subscribeNow(view: View) {

        mObservable.subscribe(mObserver)

    }
}
