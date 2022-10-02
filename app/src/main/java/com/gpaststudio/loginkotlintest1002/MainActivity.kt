package com.gpaststudio.loginkotlintest1002

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            val inputId = editId.text.toString()
            val inputPw = editPass.text.toString()


//            두개의 변수에 들어가 있는 값 검사 (맞는 아이디/비번)
//            맞을 떄 => 틀릴 떄 분기처리. (if 문 활용)


//              아이디도 비번도 둘다 맞아야 함. => 그래야 관리자.
            if (inputId == "admin@test.com"&& inputPw == "qwer"){

//                관리자 이름을 변수에 저장.
                val name = "GP_Studio"

                Toast.makeText(this, "${name} 관리자입니다", Toast.LENGTH_SHORT).show()

            }

            else {

                Toast.makeText(this, "로그인실패", Toast.LENGTH_SHORT).show()


            }






        }





//  두개의 변수에 들어간 값 검사. (맞는 아이디/비번)


//        맞을 떄 => 틀릴 때 분기 처리 (if 문 활용)

        )


    }
}