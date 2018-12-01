# Python backend

### API reference

Classes and attributes:

1. Car  
GET: pyapi/cars  
Attributes: company (text), model (text), price (integer)  
  
2. Article  
GET: pyapi/articles  
Attributes: title(text), author(text), article(text)  

3. ImageTable  
GET: pyapi/images  
Attributes: image_alt_text (text), image_url(text)  

4. Admin
Access: /admin

### Installation steps
Ensure Django and DRF are installed: 

`pip install Django`

`pip install djangorestframework`

Make migrations:

`python3 manage.py makemigrations`
`python3 manage.py migrate`

Create superuser:

`python3 manage.py createsuperuser --email a@a.com --username admin`

runserver: 

`python3 manage.py runserver`
