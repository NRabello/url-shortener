"use client"
import { UrlModel } from '@/models/Url';
import { UrlService } from '@/service/UrlService';
import Image from 'next/image';
import { useState } from 'react';

export default function Home() {
  const [url, setUrl] = useState<string>('');
  const [shortUrl, setShortUrl] = useState('Url encurtada');
  const urlService = new UrlService();

  const handleShorten = async () => {
    try {
      const response = await urlService.shortenUrl(new UrlModel({ url }));
      setShortUrl(response.data);
    } catch (error) {
      alert('Error shortening URL:' + error);
    }
  };

  return (
    <div className="flex flex-col items-center min-h-screen bg-white p-4">
      <Image className='mr-4' src="/encurtador1.png" width={500} height={400} alt="Logo"/>
      <div className="flex flex-col items-center flex-1 w-full mt-[225px]">
        <div className='bg-slate-100 p-4 rounded-lg shadow-lg flex flex-col items-center space-y-4'>
          <h1 className="text-4xl font-bold text-gray-800 p-4">Cole a URL a ser encurtada</h1>
          <div className="flex items-center space-x-4 max-w-fit mt-2">
            <input
              type="text"
              placeholder="Digite a URL"
              value={url}
              onChange={(e) => setUrl(e.target.value)}
              className="flex-1 p-2 border border-gray-300 rounded focus:outline-none focus:ring-2 focus:ring-blue-500 w-[238px]"
            />
            <button
              onClick={handleShorten}
              className="bg-blue-500 text-white p-2 rounded hover:bg-blue-600"
            >
              Encurtar
            </button>
            <span className="text-gray-500">→</span>
            <label               
              className="flex-1 p-2 bg-white border border-gray-300 rounded text-black w-[238px] h-10 overflow-hidden whitespace-nowrap"
            >
              {shortUrl}
            </label>
          </div>
          <p className="mt-2">A url tem uma duração de 1 (um) dia</p>
        </div>
      </div>
    </div>
  );
}
