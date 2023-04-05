package com.muhsanjaved.databinding_practice.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.muhsanjaved.databinding_practice.BR
import com.muhsanjaved.databinding_practice.databinding.ItemCallBinding
import com.muhsanjaved.databinding_practice.databinding.ItemEmailBinding
import com.muhsanjaved.databinding_practice.databinding.ItemMessageBinding
import com.muhsanjaved.databinding_practice.interfaces.IMainActivity
import com.muhsanjaved.databinding_practice.models.User


private const val TYPE_CALL = 0
private const val TYPE_EMAIL = 1
private const val TYPE_MESSAGE = 2

class PersonAdapter(private val userList: List<User>) :
//    RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    RecyclerView.Adapter<PersonAdapter.BindingViewHolder>(){

//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding:ViewDataBinding = when(viewType){
            TYPE_CALL ->{    ItemCallBinding.inflate(layoutInflater,parent,false) }
            TYPE_EMAIL ->{   ItemEmailBinding.inflate(layoutInflater,parent,false)}
            TYPE_MESSAGE ->{ ItemMessageBinding.inflate(layoutInflater,parent,false)}
            else -> {throw IllegalArgumentException("Unknown view type")}
        }
        return  BindingViewHolder(binding)
        /*
        return when(viewType){
            TYPE_CALL ->{
                val itemCallBinding = ItemCallBinding.inflate(layoutInflater, parent, false)
                CallViewHolder(itemCallBinding)
            }
            TYPE_EMAIL ->{
                val emailBinding = ItemEmailBinding.inflate(layoutInflater,parent,false)
                EmailViewHolder(emailBinding)
//                val rootView = layoutInflater.inflate(R.layout.item_email, parent, false)
            }
            TYPE_MESSAGE ->{
                val messageBinding = ItemMessageBinding.inflate(layoutInflater, parent, false)
                MessageViewHolder(messageBinding)
            }
            else -> throw IllegalArgumentException("Unknown view type")
        }*/
    }

    override fun getItemCount(): Int = userList.size

//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
    override fun onBindViewHolder(holder: BindingViewHolder, position: Int) {
       val user = userList[position]

//      holder.itemView.setVariable(BR.user, user)
        holder.itemBinding.setVariable(BR.user, user)
        holder.itemBinding.executePendingBindings()

       /* when(getItemViewType(position)){
            TYPE_CALL -> {
                val callViewHolder  = holder as CallViewHolder
                callViewHolder.itemView.user = user
//                callViewHolder.tvName.text = user.name
//                callViewHolder.tvPhone.text = user.phoneNo
            }
            TYPE_EMAIL -> {
                val emailViewHolder  = holder as EmailViewHolder
                emailViewHolder.itemView.user = user
            }
            TYPE_MESSAGE -> {
                val messageViewHolder  = holder as MessageViewHolder
                messageViewHolder.itemView.user = user
            }
        }*/
    }

    override fun getItemViewType(position: Int): Int {
        return userList.get(position).logType.ordinal
    }

//    class BindingViewHolder(val itemView: ViewDataBinding) : RecyclerView.ViewHolder(itemView.root)
    class BindingViewHolder(val itemBinding:ViewDataBinding) : RecyclerView.ViewHolder(itemBinding.root)

/*    class CallViewHolder(private val itemView:ItemCallBinding) :RecyclerView.ViewHolder(itemView.root)
    {
        val tvName:TextView = itemView.findViewById(R.id.tvCallName)
        val tvPhone:TextView = itemView.findViewById(R.id.tvPhoneNumber)
    }
    class EmailViewHolder(private val itemView:ItemEmailBinding) :RecyclerView.ViewHolder(itemView.root)
  {
        val tvName:TextView = itemView.findViewById(R.id.tv_name)
        val tvEmail:TextView = itemView.findViewById(R.id.tv_Email)
    }
    class MessageViewHolder(private val itemView:ItemMessageBinding) :RecyclerView.ViewHolder(itemView.root)
    {
        val tvName:TextView = itemView.findViewById(R.id.tvMessageName)
        val tvMessage:TextView = itemView.findViewById(R.id.tvMessageMessage)
    }*/

}