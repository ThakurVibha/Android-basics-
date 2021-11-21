package com.example.crypton.designs.furnitureapp.                                                     fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.crypton.R
import com.example.crypton.designs.furnitureapp.adpters.CartAdapter
import com.example.crypton.designs.furnitureapp.models.NewArrivalModel


class CartFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setAdapter()
    }

    private fun setAdapter() {
        var cartList:ArrayList<NewArrivalModel> = ArrayList()
        var newArrivalModel=NewArrivalModel()
        newArrivalModel.image=R.drawable.shoes1
        newArrivalModel.name="Nike Lunarlon"
        newArrivalModel.category="Nike Max Air"
        newArrivalModel.price="4544$"
        cartList.add(newArrivalModel)

        var newArrivalModel1=NewArrivalModel()
        newArrivalModel1.image=R.drawable.shoes
        newArrivalModel1.name="Nike FlyEase"
        newArrivalModel1.category="Nike Flyleather"
        newArrivalModel1.price="4744$"
        cartList.add(newArrivalModel1)

        var newArrivalModel2=NewArrivalModel()
        newArrivalModel2.image=R.drawable.shoes3
        newArrivalModel2.name="Nike Lunarlon"
        newArrivalModel2.category="Nike Max Air"
        newArrivalModel2.price="55454$"
        cartList.add(newArrivalModel2)

        var newArrivalModel3=NewArrivalModel()
        newArrivalModel3.image=R.drawable.shoes1
        newArrivalModel3.name="Nike Lunarlon"
        newArrivalModel3.category="Nike Max Air"
        newArrivalModel3.price="4744$"
        cartList.add(newArrivalModel3)

        var adapter=CartAdapter(cartList)
        var rv=requireActivity().findViewById<RecyclerView>(R.id.rvCart)
        rv.adapter=adapter
        rv.layoutManager=LinearLayoutManager(requireContext())



    }
}