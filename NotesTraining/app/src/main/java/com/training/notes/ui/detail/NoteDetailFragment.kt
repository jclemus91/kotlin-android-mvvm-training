package com.training.notes.ui.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.training.notes.R

class NoteDetailFragment : Fragment() {

    companion object {
        fun newInstance() = NoteDetailFragment()
    }

    private lateinit var viewModel: NoteDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.note_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NoteDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
