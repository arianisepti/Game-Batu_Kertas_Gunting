package com.bhamada.belajarkotlin

import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.ApplicationProvider
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runner.manipulation.Ordering.Context


@RunWith(AndroidJUnit4::class)
class MainActivityTest {
//
//    lateinit var mainaActivityScenario: ActivityScenario<MainActivity>
//
//    @Before
//    fun setUp() {
//        mainaActivityScenario = ActivityScenario.launch(MainActivity::class.java)
//
//    }
//
//    @Test
//    fun testBlank(){
//
//    }
//
//    @After
//    fun tearDown(){
//        mainaActivityScenario.close()
//    }

    @get:Rule
    var mainActivityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testSayHello() {

        val context = ApplicationProvider.getApplicationContext<android.content.Context>()
         val name = "Eko"
        onView(withId(R.id.nameEditText))
            .perform(typeText(name))

        onView(withId(R.id.sayHelloButton))
            .perform(click())

        onView(withId(R.id.sayHelloTextView))
            .check(matches(withText(context.getString(R.string.sayHelloTextView, name))))





    }


}