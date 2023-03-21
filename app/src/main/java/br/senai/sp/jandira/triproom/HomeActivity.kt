package br.senai.sp.jandira.triproom

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TripRoomTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreen() {

    Surface(
         modifier = Modifier
             .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.paris),
                    contentDescription = ""
                )
                Column(
                    modifier = Modifier
                        .height(197.dp),
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(horizontal = 20.dp)
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_location_on_24),
                            contentDescription = "",
                            modifier = Modifier.size(16.dp),
                            tint = Color.White
                        )
                        Text(
                            text = "You're in Paris",
                            fontSize = 14.sp,
                            color = Color.White
                        )
                    }
                    Text(
                        text = "My Trips",
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 36.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Surface(
                        shape = CircleShape,
                        border = BorderStroke(2.dp, Color.White),
                        modifier = Modifier.padding(bottom = 3.dp)
                    ) {
                        Image(painter = painterResource(
                            id = R.drawable.susanna_profile),
                            contentDescription = "",
                            modifier = Modifier.size(60.dp)
                        )
                    }
                    Text(
                        text = "Susanna Hoffs",
                        fontSize = 12.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Light
                    )
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 18.dp)
            ) {
                Text(
                    text = "Categories",
                    fontSize = 14.sp
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Card(
                        modifier = Modifier
                            .height(64.dp)
                            .width(109.dp),
                        backgroundColor = Color(207, 6, 240, 255)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxSize(),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.mountains),
                                contentDescription = "",
                                modifier = Modifier.size(32.dp)
                            )
                            Text(
                                text = "Montain",
                                fontSize = 14.sp,
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}