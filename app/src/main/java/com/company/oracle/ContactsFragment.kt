package com.company.oracle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ContactsFragment : Fragment() {

    lateinit var contactsRecyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_contacts, container, false)
        val contactsList: List<Contacts> = listOf(
            Contacts("г.Москва, пр.Мира, 1", "+7 (999) 666-66-66"),
            Contacts("г.Санкт-Петербург, пр.Ленина, 10", "+7 (999) 666-66-67"),
            Contacts("г.Нижний Новгород, ул.Московская, 100", "+7 (999) 666-66-68"),
        )

        contactsRecyclerView = view.findViewById(R.id.contacts_recycler_view)
        contactsRecyclerView.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        contactsRecyclerView.adapter = ContactsAdapter(contactsList)


        return view
    }

}