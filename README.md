# API DESCRIPTION

## Employee

### Request valid employee
`POST /likelion/departments`
### Request
```json
{
    "name" : "NguyenKiet",
    "birthDate": "2001-01-01",
    "gender": "nam",    
    "email": "nguyenkiet@gmail.com"
}
```
### Response
 ```json
{
    "status": "success",
    "data": {
        "employeeId": null,
        "name": "NguyenKiet",
        "birthDate": "01-01-2001",
        "gender": "nam",
        "email": "nguyenkiet@gmail.com"
    },
    "message": null
}
```


### Request invalid employee name
`POST /likelion/departments`
### Request
```json
{
    "name" : "kiet",
    "birthDate": "2001-01-01",
    "gender": "nam",    
    "email": "nguyenkiet@"
}
```
### Response
 ```json
{
    "status": "error",
    "data": null,
    "message": "Ten trong khoang 10 den 50 ky tu!; email khong dung format; "
}
```



