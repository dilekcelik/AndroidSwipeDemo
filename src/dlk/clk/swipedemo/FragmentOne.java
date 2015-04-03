package dlk.clk.swipedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentOne extends Fragment implements OnClickListener{
	
	Button btn;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		
		View view = inflater.inflate(R.layout.fragmentone, container, false);
		btn = (Button) view.findViewById(R.id.btn);
        btn.setOnClickListener(this);
		return view;  
        
	
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		 Toast.makeText(this.getActivity(), 
		            "Button is clicked!", Toast.LENGTH_LONG).show();

	}
	
	
	
	
}
