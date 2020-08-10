# GitTraining

1
- Tạo 1 repository trên github với 1 file README.md (content là toàn bộ yêu cầu ở đây)
- Clone repo đó về máy local
- Tạo 1 project java core tại nơi clone về. Viết 1 hàm xử lý bài toán fibonaci nhập vào số nguyên dương n, in ra n số của dãy fibonaci
- Commit project
- Push lên remote origin/master của github repository


2
- Tạo 1 nhánh (branch) trên git dựa trên (base) trên nhánh master hiện tại. (tự đặt tên)
- Viết 1 hàm truyền vào string s1 và string s2. In ra số lần s2 xuất hiện trong s1
Vd: input s1="123456789 23456 345"
		  s2="234" -> output = 2
		  s2="45" -> output = 3
- Commit và push lên nhánh vừa tạo lên github
- Merge nhánh vừa tạo vào nhánh master và push nhánh master lên repo github



3
- Tại nhánh vừa tạo sửa code hàm xử lý chuỗi cho phép in ra các đoạn string chứa đoạn s2 cách nhau bởi khoảng trắng hoặc dấu cách
Vd: input s1="123456789 23456 345"
		  s2="234" -> output = 123456789 /n 23456
		  s2="45" -> output = 123456789 /n 23456 /n 345
- Commit và push lên github


4
- Checkout Về nhánh master, xóa phần code xử lý chuỗi đi, chỉ để lại hàm fibonaci.
- Commit và push lên github
- Merge lại từ nhánh xử lý chuỗi kia lại (resolve conflict nếu có)
- Đảm bảo nhánh master có code của 2 hàm fibonaci và code xử lý chuỗi sau khi sửa
