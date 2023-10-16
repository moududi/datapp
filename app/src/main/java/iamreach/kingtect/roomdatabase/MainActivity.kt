package iamreach.kingtect.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import iamreach.kingtect.roomdatabase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "database-name"
        ).allowMainThreadQueries().build()


        binding.button.setOnClickListener {
            val name = binding.editTextText.text.toString()
            val age = binding.editTextage.text.toString()
            val mail = binding.editTextTextEmailAddress.text.toString()
            val phone = binding.editTextPhone.text.toString()

            val user = User(name = name, age = age, email = mail, mobiLe = phone)
            db.userDao().insert(user)
        }
    }
}