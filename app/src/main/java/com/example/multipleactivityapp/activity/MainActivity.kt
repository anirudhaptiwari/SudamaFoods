package com.example.multipleactivityapp.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.multipleactivityapp.R
import com.example.multipleactivityapp.SingleProductDesign
import com.example.multipleactivityapp.module.Product
import com.example.multipleactivityapp.ui.theme.MultipleActivityAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MultipleActivityAppTheme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ProductDesign()
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ProductDesign() {
    val productList = arrayListOf(
        Product(
            1,
            R.drawable.poha,
            10,
            "Garam Poha !!",
        ), Product(
            1,
            R.drawable.chai,
            5,
            "Kulhad Chai",
        ), Product(
            1,
            R.drawable.sabudana,
            20,
            "Sabudana",
        ), Product(
            1,
            R.drawable.sabudana_vada,
            20,
            "Sabudana Vada",
        ), Product(
            1,
            R.drawable.idli_sambhar,
            20,
            "Idli Sambhar",
        ), Product(
            1,
            R.drawable.masala_dosa,
            20,
            "Masala Dosa",
        ), Product(
            1,
            R.drawable.chana_chaat,
            15,
            "Chana Chaat",
        ), Product(
            1,
            R.drawable.dahi_vada,
            20,
            "Dahi Vada",
        ), Product(
            1,
            R.drawable.curd_rice,
            20,
            "Curd Rice",
        ), Product(
            1,
            R.drawable.kadhi_bhel,
            15,
            "Kadhi Bhel",
        ), Product(
            1,
            R.drawable.kachaloo,
            15,
            "Aloo Kachaloo",
        ), Product(
            1,
            R.drawable.nimbu_pani,
            5,
            "Nimbu Pani",
        ), Product(
            1,
            R.drawable.buttermilk,
            5,
            "Buttermilk",
        ), Product(
            1,
            R.drawable.lassi,
            10,
            "Lassi",
        )


    )
    Design(list = productList)
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Design(list: ArrayList<Product>) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.padding(20.dp)
    ) {
        LazyVerticalGrid(
            cells = GridCells.Fixed(2),
            content = {
                items(list.size) { index ->
                    val product = list[index]

                    SingleProductDesign(product)


                }
            }
        )

    }
}
