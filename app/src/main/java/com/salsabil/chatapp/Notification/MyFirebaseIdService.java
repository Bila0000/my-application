package com.salsabil.chatapp.Notification;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MyFirebaseIdService   {

private void updateToken(String refrechToken){
    FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();

    DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Tokens");
    Token token = new Token(refrechToken);
    reference.child(firebaseUser.getUid()).setValue(token);
}
}
