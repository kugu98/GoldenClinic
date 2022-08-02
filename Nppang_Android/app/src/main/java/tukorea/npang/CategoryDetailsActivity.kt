package tukorea.npang

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tukorea.npang.databinding.ActivityCategoryDetailsBinding

class CategoryDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCategoryDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //카테고리 Name설정
        val firstintent = intent
        binding.tvCategorytitle.text = firstintent.getStringExtra("카테고리")

        binding.btnWritePost.setOnClickListener{
            val intent = Intent(this, PostingActivity::class.java)
            startActivity(intent)
        }
    }
}
