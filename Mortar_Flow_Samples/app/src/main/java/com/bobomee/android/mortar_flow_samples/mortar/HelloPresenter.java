/*
 * Copyright (C) 2016.  BoBoMEe(wbwjx115@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.bobomee.android.mortar_flow_samples.mortar;

import android.os.Bundle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import mortar.ViewPresenter;

public class HelloPresenter extends ViewPresenter<HelloView> {
  private final DateFormat format = new SimpleDateFormat();
  private int serial = -1;

  @Override protected void onLoad(Bundle savedInstanceState) {
    if (savedInstanceState != null && serial == -1) serial = savedInstanceState.getInt("serial");
    getView().show("Update #" + ++serial + " at " + format.format(new Date()));
  }

  @Override protected void onSave(Bundle outState) {
    outState.putInt("serial", serial);
  }
}
