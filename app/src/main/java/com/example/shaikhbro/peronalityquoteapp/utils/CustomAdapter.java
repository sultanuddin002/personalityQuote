package com.example.shaikhbro.peronalityquoteapp.utils;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.shaikhbro.peronalityquoteapp.R;

/**
 * Created by ShaikhBro on 5/5/2017.
 */
public class CustomAdapter extends ArrayAdapter<ListItems> {

    Context context;
    int resource;
    ListItems[] data = null;

    public CustomAdapter(Context context, int resource, ListItems[] data) {
        super(context, resource, data);
        this.context = context;
        this.resource = resource;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ListItemHolder holder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(resource, parent, false);

            holder = new ListItemHolder();
            holder.quote = (TextView) row.findViewById(R.id.quoteText);
            holder.saidBy = (TextView) row.findViewById(R.id.saidBy);

            row.setTag(holder);
        } else {
            holder = (ListItemHolder) row.getTag();
        }
        ListItems items = data[position];
        holder.quote.setText(items.quote);
        holder.saidBy.setText(items.saidBy);

        return row;

    }

    static class ListItemHolder {
        TextView quote;
        TextView saidBy;
    }
}
