from django.db import models

# Create your models here.


class Article(models.Model):
    # Simulate large text parts
    title = models.TextField()
    author = models.TextField()
    article = models.TextField()
    ID = models.AutoField(primary_key=True)


class Car(models.Model):
    # Simulate a form
    company = models.TextField()
    model = models.TextField()
    price = models.BigIntegerField()
    ID = models.AutoField(primary_key=True)


class ImageTable(models.Model):
    # Simulate image rendering
    image_alt_text = models.TextField()
    image_url = models.TextField()
    ID = models.AutoField(primary_key=True)
