package gw.gobpo2005.rawg.main_page.ui

import android.os.Bundle
import android.view.View
import gw.gobpo2005.rawg.R
import gw.gobpo2005.rawg.common.fragment.BaseFragment
import gw.gobpo2005.rawg.databinding.FragmentListOfGamesBinding
import gw.gobpo2005.rawg.utils.viewbinding.viewBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ListOfGamesFragment : BaseFragment(R.layout.fragment_list_of_games) {

    private val viewModel: RawgViewModel by viewModel()
    private val binding: FragmentListOfGamesBinding by viewBinding()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getGamesData()
    }
}