package com.lambdaschool.animatedlayoutdemocode.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Explode
import android.transition.Slide
import android.view.Window
import androidx.core.content.ContextCompat
import com.lambdaschool.animatedlayoutdemocode.R
import com.lambdaschool.animatedlayoutdemocode.model.ShoppingItem
import kotlinx.android.synthetic.main.activity_item_detail.*

class ItemDetail : AppCompatActivity() {

    companion object{
        const val ITEM_KEY = "SHOPPING_ITEM_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        window.enterTransition = Explode()
        window.exitTransition = Slide()

        setContentView(R.layout.activity_item_detail)

        val item = intent.getSerializableExtra(ITEM_KEY) as ShoppingItem
        tv_item_image.text = item.name
        iv_item_image.setImageDrawable(ContextCompat.getDrawable(this, item.drawableId))
    }
}
