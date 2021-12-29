package com.example.crypton.kotlinbasics.retrofitbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.crypton.R
import kotlinx.android.synthetic.main.activity_github.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.MultipartBody
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.await
import android.os.FileUtils
import okhttp3.MediaType
import java.io.File


/**
 * ..simple  GET request and sending dynamic parameter
 */
class GithubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github)
//        fetchRepos()
        uploadFile()
    }

    private fun uploadFile() {

        // https://github.com/iPaulPro/aFileChooser/blob/master/aFileChooser/src/com/ipaulpro/afilechooser/utils/FileUtils.java
        // use the FileUtils to get the actual file by uri
        val file: File = FileUtils.getFile(this, fileUri)

        // create RequestBody instance from file

        // create RequestBody instance from file
        val requestFile: RequestBody = RequestBody.create(
            MediaType.parse(contentResolver.getType(fileUri)),
            file
        )

        // MultipartBody.Part is used to send also the actual file name

        // MultipartBody.Part is used to send also the actual file name
        val body = MultipartBody.Part.createFormData("picture", file.getName(), requestFile)

        // add another part within the multipart request

        // add another part within the multipart request
        val descriptionString = "hello, this is description speaking"
        val description = RequestBody.create(
            MultipartBody.FORM, descriptionString
        )


    }

    private fun fetchRepos() {
        CoroutineScope(Dispatchers.IO).launch {
            val response = RetrofitInstance.service.getRepos("ThakurVibha").await()

            CoroutineScope(Dispatchers.Main).launch {
                var repos: ArrayList<GithubRepoModel> = response as ArrayList<GithubRepoModel>
                rvList.adapter = GithubRepoAdapter(this@GithubActivity, repos)
                rvList.layoutManager = LinearLayoutManager(this@GithubActivity)

            }

        }

    }
}