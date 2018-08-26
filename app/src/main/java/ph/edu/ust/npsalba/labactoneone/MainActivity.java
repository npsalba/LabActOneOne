package ph.edu.ust.npsalba.labactoneone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonShowResult = (Button) findViewById(R.id.buttonShowResult);
        buttonShowResult.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);

                //int result = fNo + sNo;

                int[] result = new int[10];
                int counter = 1;
                int maxCounter = 11;
                int arrayCounter = 0;

                for(int n = 0; counter < maxCounter; n++){
                    if(n%2==0){
                        counter++;
                        result[arrayCounter++] = n;
                    }
                }

                int arraySize = result.length;
                for(int i = 0; i < arraySize; i++) {
                    textViewResult.append(result[i] + " ");
                }
            }
        });
    }
}
