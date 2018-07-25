# ParkingLot API

标签（空格分隔）： Spring-boot

---

1.添加停车小弟
```java
URL:[post]/parkingBoys
method:addParkingBoy()
response
{
    "name": "停车小弟二",
    "parkingLotList": [
        {
            "id": "D1",
            "name": "停车场第er个",
            "size": 3,
             "carList": []
        }
    ]
}
request
{
    "id": "D1",
    "name": "停车小弟二",
    "parkingLotList": [
        {
            "id": "D1",
            "name": "停车场第er个",
            "size": 3,
            "carList": []
        }
    ]
}
```
2.添加停车场
```java
URL:[post]/parkingLots
method:addParkingLot()
response
{
    "name": "停车场第er个",
    "size": 3,
    "carList": []
}
request
{
    "id": "L1",
    "name": "停车场第er个",
    "size": 3,
    "carList": []
}
```
2.把停车场给停车小弟
```java
URL:[post]/parkingBoys/{boyId}/parkingLots
method:addParkingBoyParkingLot()
response
{
	"id":"D2",
    "name": "停车场第er个",
    "size": 3,
    "carList": []
}
request
{
    "id": "D1",
    "name": "停车小弟jj",
    "parkingLotList": [
        {
            "id": "D1",
            "name": "停车场第一个",
            "size": 2,
            "carList": []
        },
        {
            "id": "D2",
            "name": "停车场第er个",
            "size": 3,
            "carList": []
        }
    ]
}
```
