package echacks2018.lumberlog.database;

import android.support.annotation.NonNull;
import android.util.Log;
import android.util.NoSuchPropertyException;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DatabaseManager implements ValueEventListener {

    private static DatabaseManager singleton  ;
    private DatabaseReference mDatabase;


    public static DatabaseManager getInstance(){
        if (singleton == null){
            singleton = new DatabaseManager() ;
        }
        return singleton ;
    }

    private DatabaseManager(){
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.addValueEventListener(this);
        }

    public void addEntity(Tree entity){
        throw new NullPointerException() ;
    }

    public Tree[] getList(){ throw new NullPointerException() ; }



    public Tree[] getListByDeadline(){
        throw new NullPointerException() ;

    }

    public Tree[] getListByDistance(Tree.GPS location){
        throw new NullPointerException() ;
    }




    @Override
    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

        for (DataSnapshot childDataSnapshot : dataSnapshot.getChildren()) {
            Log.e("TEST",""+ childDataSnapshot.getKey()); //displays the key for the node
        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError databaseError) {

    }
}
