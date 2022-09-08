# API DESCRIPTION

## Employee

### Request valid employee
`POST /likelion/employees`
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
`POST /likelion/employees`
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

## Department

### Request valid department
`POST /likelion/departments`
### Request
```json
{
  "deptName": "Software Engineering", 
  "description": "Phong software",
  "employees": [
    {
        "name" : "nguyenkiet1",
        "birthDate": "2001-01-01",
        "gender": "nam",    
        "email": "nguyenkiet@gmail.com"
    }
  ]
}
```
### Response
```json
{
    "status": "success",
    "data": {
        "departmentId": null,
        "deptName": "Software Engineering",
        "description": "Phong software",
        "employees": [
            {
                "employeeId": null,
                "name": "nguyenkiet1",
                "birthDate": "01-01-2001",
                "gender": "nam",
                "email": "nguyenkiet@gmail.com"
            }
        ]
    },
    "message": null
}
```

### Request invalid department attributes
`POST /likelion/departments`
### Request
```json
{
  "deptName": "Softwar", 
  "description": "",
  "employees": [
    {
        "name" : "nguyenkiet1",
        "birthDate": "2001-01-01",
        "gender": "nam",    
        "email": "nguyenkiet@gmail.com"
    }
  ]
}
```
### Response
```json
{
   "status": "error",
    "data": null,
    "message": "deptName trong khoang 10 den 50 ky tu!; Description khong dc de trong; "
}
```

### Request invalid employees attribites of department
`POST /likelion/departments`
### Request
```json
{
  "deptName": "Software Engineering", 
  "description": "Phong software",
  "employees": [
    {
        "name" : "teo",
        "birthDate": "2001-01-01",
        "gender": "nam",    
        "email": "nguyenkietgmail.com"
    }
  ]
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

## Logger & AOP
### logging when method getDepartmentDto executed successfully
```
2022-09-07 23:18:53 WARN  [http-nio-9081-exec-5] c.r.n.c.EmployeeConfig - before employeeDto method
2022-09-07 23:18:53 INFO  [http-nio-9081-exec-5] c.r.n.s.i.EmployeeServiceImpl - Info ne:EmployeeDto(employeeId=null, name=kiet nguyen, birthDate=2001-01-01, gender=nam, email=nguyenkiet@gmail.com)
2022-09-07 23:18:53 WARN  [http-nio-9081-exec-5] c.r.n.c.EmployeeConfig - After employeeDto method
```

### logging when method getDepartmentDto executed unsuccessfully
```
2022-09-07 23:22:00 WARN  [http-nio-9081-exec-2] c.r.n.c.EmployeeConfig - before employeeDto method
2022-09-07 23:22:00 WARN  [http-nio-9081-exec-2] c.r.n.c.EmployeeConfig - after throwing employeeDto method!!
2022-09-07 23:22:00 WARN  [http-nio-9081-exec-2] c.r.n.c.EmployeeConfig - After employeeDto method
```

