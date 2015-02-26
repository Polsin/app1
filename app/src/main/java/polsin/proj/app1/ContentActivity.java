package polsin.proj.app1;

import android.content.Intent;
import android.widget.TextView;

/**
 * Created by polsin on 25/02/2015.
 */
public class ContentActivity {
    TextView tvNext;
    Intent intent = getIntent();
    String someValue = intent.getStringExtra("someValue");

    tvNext = (TextView) findViewById(R.id.txNext);

    public Intent getIntent() {
        return intent;
    }

    tvNext.setText(someValue);

}

