# ParceLable

```java
class DataItem implements Parcelable {
}
```

```java
Intent intent = new Intent(mContext, SecondActivity.class);
intent.putExtra("data_parce", names.get(position));
mContext.startActivity(intent);
```

```java
Intent intent = getIntent();
DataItem current = intent.getParcelableExtra("data_parce");
```

---

```
Copyright 2022 M. Fadli Zein
```
