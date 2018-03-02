package com.example.user.final_project;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

/**
 * Created by User on 3/2/2018.
 */

public class recyvler_view_adapter extends RecyclerView.Adapter<recyvler_view_adapter.ViewHolder> {
    private List<Adapter> artPieces;


    public recyvler_view_adapter(List<Adapter> artPieces){this.artPieces = artPieces;}






    public recyvler_view_adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View artPieceView = inflater.inflate( R.layout.row_layout, parent, false);
        return new ViewHolder(artPieceView);


    }

    @Override


    public void onBindViewHolder(recyvler_view_adapter.ViewHolder holder, int position) {
        Adapter artPiece = artPieces.get(position);
        holder.name.setText(artPiece.getName());
        holder.phone.setText(artPiece.getPhoneNumber());

    }
    public int getItemCount() {
        return artPieces.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        //Fields corresponding to the row layout elements
        public TextView name;
        public TextView phone;

        public Button checkItOutButton;

        public ViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.editTextName);
            phone = (TextView) itemView.findViewById(R.id.editTextPhoneNumber);

            // checkItOutButton = (Button) itemView.findViewById(R.id.checkItOutButton);

        }
    }


}
