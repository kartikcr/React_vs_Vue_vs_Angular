from rest_framework import serializers
from .models import *


class ArticleSerializer(serializers.ModelSerializer):
    class Meta:
        model = Article
        fields=('ID','title', 'author', 'article')


class CarSerializer(serializers.ModelSerializer):
    class Meta:
        model = Car
        fields = ('ID','company', 'model', 'price')


class ArticleSerializer(serializers.ModelSerializer):
    class Meta:
        model = Article
        fields = ('ID','title', 'author', 'article')


class ImageTableSerializer(serializers.ModelSerializer):
    class Meta:
        model = ImageTable
        fields = ('ID','image_url','image_alt_text')
