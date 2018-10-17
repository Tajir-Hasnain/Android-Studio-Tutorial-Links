
//You need to add 
// implementation 'com.android.volley:volley:1.1.1'
//in your app level build.gradle file

public void getReqCount() {

        //JSON
        RequestQueue queue = Volley.newRequestQueue(this);
        Log.d("Status","Getting JSON Object from server");
        String url = "foobar.com/getReq";
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
                Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    // Do your job with JSONObject response here
                    
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.v("Status","Json request failed");
            }
        });
        queue.add(jsonObjectRequest);
    }
