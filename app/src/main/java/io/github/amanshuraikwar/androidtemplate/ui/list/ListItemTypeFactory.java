package io.github.amanshuraikwar.androidtemplate.ui.list;

import android.support.annotation.NonNull;
import android.view.View;

import io.github.amanshuraikwar.multiitemlistadapter.BaseTypeFactory;
import io.github.amanshuraikwar.multiitemlistadapter.ViewHolder;
import io.github.amanshuraikwar.androidtemplate.ui.list.photo.PhotoListItem;
import io.github.amanshuraikwar.androidtemplate.ui.list.photo.PhotoViewHolder;

/**
 * List item type factory responsible for getting layout id and ViewHolder instance.
 *
 * @author Amanshu Raikwar
 * Created by Amanshu Raikwar on 20/12/17.
 */
@SuppressWarnings("unused")
public class ListItemTypeFactory extends BaseTypeFactory {

    /**
     * To get type for a list item
     * @param item list item
     * @return type of the provided list item
     */
    public int type(PhotoListItem item) {
        return 0;
    }

    /**
     * To get layout file id (R.layout.*) for a corresponding list item/view type.
     *
     * @param viewType list item/view type.
     * @return layout file id corresponding to list item/view type.
     */
    public int getLayout(int viewType) {
        switch (viewType) {
            case 0:
                return PhotoViewHolder.Companion.getLAYOUT();
            default:
                return super.getLayout(viewType);
        }
    }

    /**
     * To get ViewHolder instance for corresponding list item/view type.
     *
     * @param parent parent view instance to instantiate corresponding ViewHolder instance.
     * @param type list item/view type of which the ViewHolder instance is needed.
     * @return ViewHolder instance for the given list item/view type.
     */
    public ViewHolder createViewHolder(@NonNull View parent, int type) {

        ViewHolder viewHolder;

        switch (type) {
            case 0:
                viewHolder = new PhotoViewHolder(parent);
                break;
            default:
                viewHolder = super.createViewHolder(parent, type);
        }

        return viewHolder;
    }
}
