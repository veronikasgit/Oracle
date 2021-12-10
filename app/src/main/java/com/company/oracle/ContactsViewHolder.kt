package com.company.oracle

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val addressTextView: TextView = itemView.findViewById(R.id.address_text_view)
    val telTextView: TextView = itemView.findViewById(R.id.tel_text_view)

    fun bind(contacts: Contacts) {
        addressTextView.text = contacts.address
        telTextView.text = contacts.tel
    }

}