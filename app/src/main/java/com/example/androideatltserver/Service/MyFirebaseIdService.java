package com.example.androideatltserver.Service;

import com.example.androideatltserver.Common.Common;
import com.example.androideatltserver.Model.Token;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class MyFirebaseIdService extends FirebaseInstanceIdService {

    public void onTokenRefresh(){
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        updateToServer(refreshedToken);

    }

    private void updateToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokes = db.getReference("Tokens");
        Token data = new Token(refreshedToken,true);
        tokes.child(Common.currentUser.getPhone()).setValue(data);
    }


}
