package com.muhsanjaved.databinding_practice.adapters

import android.telecom.Call
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.muhsanjaved.databinding_practice.R
import com.muhsanjaved.databinding_practice.models.User


private const val TYPE_CALL = 0
private const val TYPE_EMAIL = 1
private const val TYPE_MESSAGE = 2

class PersonAdapter(private val userList: List<User>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)

        return when(viewType){
            TYPE_CALL ->{
                val rootView = layoutInflater.inflate(R.layout.item_call, parent, false)
                CallViewHolder(rootView)
            }
            TYPE_EMAIL ->{
                val rootView = layoutInflater.inflate(R.layout.item_email, parent, false)
                EmailViewHolder(rootView)
            }
            TYPE_MESSAGE ->{
                val rootView = layoutInflater.inflate(R.layout.item_message, parent, false)
                MessageViewHolder(rootView)
            }
            else -> throw IllegalArgumentException("Unknown view type")
        }
    }

    override fun getItemCount(): Int = userList.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       val user = userList.get(position)

        when(getItemViewType(position)){
            TYPE_CALL -> {
                val callViewHolder  = holder as CallViewHolder
                callViewHolder.tvName.text = user.name
                callViewHolder.tvPhone.text = user.phoneNo
            }
            TYPE_EMAIL -> {
                val emailViewHolder  = holder as EmailViewHolder
                emailViewHolder.tvName.text = user.name
                emailViewHolder.tvEmail.text = user.email
            }
            TYPE_MESSAGE -> {
                val messageViewHolder  = holder as MessageViewHolder
                messageViewHolder.tvName.text = user.name
                messageViewHolder.tvMessage.text = user.message
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return userList.get(position).logType.ordinal
    }

    class CallViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val tvName:TextView = itemView.findViewById(R.id.tvCallName)
        val tvPhone:TextView = itemView.findViewById(R.id.tvPhoneNumber)
    }
    class EmailViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val tvName:TextView = itemView.findViewById(R.id.tv_name)
        val tvEmail:TextView = itemView.findViewById(R.id.tv_Email)
    }
    class MessageViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        val tvName:TextView = itemView.findViewById(R.id.tvMessageName)
        val tvMessage:TextView = itemView.findViewById(R.id.tvMessageMessage)
    }

}