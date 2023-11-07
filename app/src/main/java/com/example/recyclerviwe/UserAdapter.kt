package com.example.recyclerviwe

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recyclerviwe.databinding.ItemRvBinding

class UserAdapter (val userList:MutableList<User>) :RecyclerView.Adapter<UserViewHolder>() {
    
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        var binding = ItemRvBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        
        return UserViewHolder(binding)
    }
    
    override fun getItemCount(): Int {
    
    return userList.size
    
    }
    
    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        
        var user=userList[position]
        
        holder.binding.mane.text=user.name
        holder.binding.message.text=user.message
        holder.binding.time.text=user.time
        holder.binding.profile.load(user.image)
        
        
    }
}