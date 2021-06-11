package com.codeenjoyers.mentaltracker.ui.stats

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.codeenjoyers.mentaltracker.R

class StatsFragment : Fragment() {

    private lateinit var slideshowViewModel: StatsViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        slideshowViewModel =
                ViewModelProvider(this).get(StatsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_stats, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        slideshowViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}