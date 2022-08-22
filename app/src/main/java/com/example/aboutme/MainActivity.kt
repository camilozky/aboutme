package com.example.aboutme

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val myName = MyName(
            name = "Milo Rendon",
            nickname = "Milo",
            bio = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Egestas congue quisque egestas diam in arcu cursus. Tincidunt nunc pulvinar sapien et ligula. Arcu bibendum at varius vel pharetra vel turpis. Ornare quam viverra orci sagittis eu volutpat odio. Habitasse platea dictumst vestibulum rhoncus. Eget mi proin sed libero enim. Ut faucibus pulvinar elementum integer enim neque volutpat ac. Urna porttitor rhoncus dolor purus non enim praesent elementum facilisis. Integer malesuada nunc vel risus commodo. Velit sed ullamcorper morbi tincidunt ornare massa eget. Et odio pellentesque diam volutpat. Nec feugiat nisl pretium fusce id velit ut tortor. Dolor morbi non arcu risus quis varius quam. Ipsum dolor sit amet consectetur adipiscing.\n" +
                    "\n" +
                    "Odio ut enim blandit volutpat maecenas volutpat. Orci eu lobortis elementum nibh tellus molestie. Nulla facilisi etiam dignissim diam quis enim lobortis scelerisque fermentum. Viverra adipiscing at in tellus integer feugiat scelerisque varius. Faucibus et molestie ac feugiat. Est placerat in egestas erat imperdiet sed. Ac ut consequat semper viverra nam. Massa massa ultricies mi quis hendrerit. Elit eget gravida cum sociis natoque. Tempus imperdiet nulla malesuada pellentesque elit eget gravida. Fringilla urna porttitor rhoncus dolor. Tincidunt tortor aliquam nulla facilisi cras. Auctor elit sed vulputate mi sit amet mauris commodo. Venenatis a condimentum vitae sapien pellentesque habitant. Eget est lorem ipsum dolor sit amet consectetur.\n" +
                    "\n" +
                    "Velit egestas dui id ornare arcu. Posuere ac ut consequat semper viverra nam. Enim praesent elementum facilisis leo vel fringilla est. Consequat id porta nibh venenatis cras. Accumsan sit amet nulla facilisi morbi tempus iaculis urna. Sagittis orci a scelerisque purus. Et ligula ullamcorper malesuada proin libero nunc consequat interdum varius. Montes nascetur ridiculus mus mauris vitae ultricies leo integer malesuada. Nunc mi ipsum faucibus vitae aliquet nec ullamcorper sit amet. Viverra justo nec ultrices dui sapien eget mi proin sed. Mauris sit amet massa vitae tortor condimentum lacinia. Dignissim convallis aenean et tortor at risus viverra. Morbi tempus iaculis urna id volutpat. Morbi blandit cursus risus at."
        )
        setContentView(binding.root)
        binding.name = myName.name
        binding.bio = myName.bio
        binding.doneButton.setOnClickListener {
            addNickName(it)
        }
    }

    @SuppressLint("ServiceCast")
    private fun addNickName(view: View) {
        binding.apply {
            nickName = nicknameEdit.text.toString()
            invalidateAll()
            nicknameEdit.visibility = View.GONE
            doneButton.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }
        // Hide the keyboard.
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
