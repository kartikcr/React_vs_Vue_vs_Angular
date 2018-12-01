from django.shortcuts import render
from .serializer import *
from .models import *
from rest_framework import generics


class ArticleView(generics.ListAPIView):
    # ListAPIView provides GET method handlers
    queryset = Article.objects.all()
    serializer_class = ArticleSerializer


class CarView(generics.ListAPIView):
    # ListAPIView provides GET method handlers
    queryset = Car.objects.all()
    serializer_class = CarSerializer


class ImageTableView(generics.ListAPIView):
    # ListAPIView provides GET method handlers
    queryset = ImageTable.objects.all()
    serializer_class = ImageTableSerializer
