package com.tamizna.bangkitlistfragment.learnList.recyclerView

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fruit(
    val name: String,
    val desc: String,
    val photo: Int) : Parcelable
