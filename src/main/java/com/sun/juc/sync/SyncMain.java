package com.sun.juc.sync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncMain {
    List<String> list = Collections.synchronizedList(new ArrayList<>());
}
