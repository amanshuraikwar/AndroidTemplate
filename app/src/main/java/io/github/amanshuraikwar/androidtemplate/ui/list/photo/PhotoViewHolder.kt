package io.github.amanshuraikwar.androidtemplate.ui.list.photo

import android.support.annotation.LayoutRes
import android.support.v4.app.FragmentActivity
import android.view.View
import io.github.amanshuraikwar.multiitemlistadapter.ViewHolder
import io.github.amanshuraikwar.androidtemplate.R
import io.github.amanshuraikwar.androidtemplate.util.Util

/**
 * ViewHolder corresponding to Photo ListItem
 *
 * @author Amanshu Raikwar
 * Created by Amanshu Raikwar on 11/03/18.
 */
class PhotoViewHolder(itemView: View) : ViewHolder<PhotoListItem>(itemView) {

    private val TAG = Util.getTag(this)

    companion object {
        @LayoutRes
        val LAYOUT = R.layout.item_photo
    }

    override fun bind(listItem: PhotoListItem, host: FragmentActivity) {

    }
}